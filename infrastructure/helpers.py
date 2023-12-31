"""
Cluster 	    arn:aws:kafka:region:account-id:cluster/cluster-name/cluster-uuid
Topic 	        arn:aws:kafka:region:account-id:topic/cluster-name/cluster-uuid/topic-name
Group 	        arn:aws:kafka:region:account-id:group/cluster-name/cluster-uuid/group-name
Transaction ID 	arn:aws:kafka:region:account-id:transactional-id/cluster-name/cluster-uuid/transactional-id
"""
from typing import List
from typing import Tuple

from aws_cdk import Arn as arn
from aws_cdk import ArnFormat as af
from aws_cdk import Fn as fn
from aws_cdk import aws_ec2 as ec2
from constructs import Node


def get_topic_name(kafka_cluster_arn: str, topic_name: str):
    # cluster-name/cluster-uuid
    _arn = arn.split(kafka_cluster_arn, af.SLASH_RESOURCE_SLASH_RESOURCE_NAME)
    cluster_name = _arn.resource
    cluster_uuid = _arn.resource_name

    prefix_arn = arn.split(kafka_cluster_arn, af.COLON_RESOURCE_NAME)

    # arn:{partition}:{service}:{region}:{account}:{resource}{sep}{resource-name}
    arn_with_topic = fn.join(
        delimiter="",
        list_of_values=[
            "arn",
            ":",
            prefix_arn.partition,
            ":",
            prefix_arn.service,
            ":",
            prefix_arn.region,
            ":",
            prefix_arn.account,
            ":topic/",
            cluster_name,
            "/",
            cluster_uuid,
            "/",
            topic_name,
        ],  # type: ignore
    )

    return arn_with_topic


def get_group_name(kafka_cluster_arn: str, group_name: str):
    # cluster-name/cluster-uuid
    _arn = arn.split(kafka_cluster_arn, af.SLASH_RESOURCE_SLASH_RESOURCE_NAME)
    cluster_name = _arn.resource
    cluster_uuid = _arn.resource_name

    prefix_arn = arn.split(kafka_cluster_arn, af.COLON_RESOURCE_NAME)

    # arn:{partition}:{service}:{region}:{account}:{resource}{sep}{resource-name}
    arn_with_topic = fn.join(
        delimiter="",
        list_of_values=[
            "arn",
            ":",
            prefix_arn.partition,
            ":",
            prefix_arn.service,
            ":",
            prefix_arn.region,
            ":",
            prefix_arn.account,
            ":group/",
            cluster_name,
            "/",
            cluster_uuid,
            "/",
            group_name,
        ],  # type: ignore
    )

    return arn_with_topic
